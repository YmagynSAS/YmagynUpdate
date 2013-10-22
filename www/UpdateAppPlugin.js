
var UpdateAppPlugin = function(){
}

cordova.addConstructor(function(){
    if(!window.plugins) window.plugins = {};
    window.plugins.UpdateAppPlugin = new UpdateAppPlugin();
});

UpdateAppPlugin.prototype.callNewView = function(archivePath, successCallback, errorCallback) 
{
    return cordova.exec(successCallback, errorCallback, "UpdateAppPlugin", "callNewView", [archivePath]);
};
