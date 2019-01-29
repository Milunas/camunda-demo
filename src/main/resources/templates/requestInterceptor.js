// define a new module to be loaded
define([], function() {

  (function(open) {
    XMLHttpRequest.prototype.open = function() {
      open.apply(this, arguments);
      this.withCredentials = true;
      this.setRequestHeader('X-Something-I-Need-Just-To-Test', 'works');
    };
  })(XMLHttpRequest.prototype.open);
});