(function () {
  //addTag('base', { href: "/merilyticschatbot/" });
  window.name = "merilyticschatbot";
  /* CSS */
 

 
  addTag('link', { rel: "stylesheet", href: 'https://fonts.googleapis.com/icon?family=Material+Icons',type: 'text/css'});
  
  /* Less CSS*/

  
 
  
  
  


 
  
  function addTag(name, attributes) {
    var el = document.createElement(name), attrName;
    for (attrName in attributes) { el.setAttribute(attrName, attributes[attrName]); }
    document.write(outerHTML(el));
  }

  function outerHTML(node) {
    return node.outerHTML || (
      function (n) {
        var div = document.createElement('div'), h; div.appendChild(n); h = div.innerHTML; div = null;
        return h;
      })(node);
  }
})();