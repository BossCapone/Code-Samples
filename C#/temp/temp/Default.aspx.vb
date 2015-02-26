Public Class _Default
    Inherits Page

    Private Property beverage As Decimal
    Private Property appetizer As Decimal
    Private Property main As Decimal
    Private Property dessert As Decimal

    Private Property subtotal As Decimal

    Private Property tax As Double

    Private Property total As Double

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As EventArgs) Handles Me.Load

    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs)

        beverage = From price In DropDownList1
                   Select price;

        appetizer
        main
        dessert
        tax = 1.07

        subtotal = beverage+appetizer+main+dessert;
        total = subtotal *tax;


    End Sub
End Class