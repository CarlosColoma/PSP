using System;
using Gtk;
using System.Xml;

namespace PXml
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			XmlTextWriter xmlTextWriter = new XmlTextWriter(Console.Out);
			xmlTextWriter.WriteStartDocument();
			xmlTextWriter.WriteString("articulo1");
			xmlTextWriter.WriteStartAttribute("nombre");
			xmlTextWriter.WriteString("Articulo uno");
			xmlTextWriter.Close();
		}
	}
}
