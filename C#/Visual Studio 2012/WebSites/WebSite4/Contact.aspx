<%@ Page Title="Contact" Language="VB" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeFile="Contact.aspx.vb" Inherits="Contact" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <hgroup class="title">
        <h1><%: Title %>.</h1>
        <h2>Your contact page.</h2>
    </hgroup>

    <section class="contact">
        <header>
            <h3>Phone:</h3>
        </header>
        <p>
            <span class="label">Main:</span>
            <span>425.555.0100</span>
        </p>
        <p>
            <span class="label">After Hours:</span>
            <span>425.555.0199</span>
        </p>
    </section>

    <section class="contact">
        <header>
            <h3>Email:</h3>
        </header>
        <p>
            <span class="label">Support:</span>
            <span><a href="mailto:Support@example.com">Support@example.com</a></span>
        </p>
        <p>
            <span class="label">Marketing:</span>
            <span><a href="mailto:Marketing@example.com">Marketing@example.com</a></span>
        </p>
        <p>
            <span class="label">General:</span>
            <span><a href="mailto:General@example.com">General@example.com</a></span>
        </p>
    </section>

    <section class="contact">
        <header>
            <h3>Address:</h3>
        </header>
        <p>
            One Microsoft Way<br />
            Redmond, WA 98052-6399
        </p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            Book</p>
        <p>
            <asp:FormView ID="FormView1" runat="server" DataKeyNames="Book_id" DataSourceID="SqlDataSource1" DefaultMode="Insert">
                <EditItemTemplate>
                    Book_id:
                    <asp:Label ID="Book_idLabel1" runat="server" Text='<%# Eval("Book_id") %>' />
                    <br />
                    Author:
                    <asp:TextBox ID="AuthorTextBox" runat="server" Text='<%# Bind("Author") %>' />
                    <br />
                    Title:
                    <asp:TextBox ID="TitleTextBox" runat="server" Text='<%# Bind("Title") %>' />
                    <br />
                    Price:
                    <asp:TextBox ID="PriceTextBox" runat="server" Text='<%# Bind("Price") %>' />
                    <br />
                    available:
                    <asp:CheckBox ID="availableCheckBox" runat="server" Checked='<%# Bind("available") %>' />
                    <br />
                    <asp:LinkButton ID="UpdateButton" runat="server" CausesValidation="True" CommandName="Update" Text="Update" />
                    &nbsp;<asp:LinkButton ID="UpdateCancelButton" runat="server" CausesValidation="False" CommandName="Cancel" Text="Cancel" />
                </EditItemTemplate>
                <InsertItemTemplate>
                    Author:
                    <asp:TextBox ID="AuthorTextBox" runat="server" Text='<%# Bind("Author") %>' />
                    <br />
                    Title:
                    <asp:TextBox ID="TitleTextBox" runat="server" Text='<%# Bind("Title") %>' />
                    <br />
                    Price:
                    <asp:TextBox ID="PriceTextBox" runat="server" Text='<%# Bind("Price") %>' />
                    <br />
                    available:
                    <asp:CheckBox ID="availableCheckBox" runat="server" Checked='<%# Bind("available") %>' />
                    <br />
                    <asp:LinkButton ID="InsertButton" runat="server" CausesValidation="True" CommandName="Insert" Text="Insert" />
                    &nbsp;<asp:LinkButton ID="InsertCancelButton" runat="server" CausesValidation="False" CommandName="Cancel" Text="Cancel" />
                </InsertItemTemplate>
                <ItemTemplate>
                    Book_id:
                    <asp:Label ID="Book_idLabel" runat="server" Text='<%# Eval("Book_id") %>' />
                    <br />
                    Author:
                    <asp:Label ID="AuthorLabel" runat="server" Text='<%# Bind("Author") %>' />
                    <br />
                    Title:
                    <asp:Label ID="TitleLabel" runat="server" Text='<%# Bind("Title") %>' />
                    <br />
                    Price:
                    <asp:Label ID="PriceLabel" runat="server" Text='<%# Bind("Price") %>' />
                    <br />
                    available:
                    <asp:CheckBox ID="availableCheckBox" runat="server" Checked='<%# Bind("available") %>' Enabled="false" />
                    <br />

                </ItemTemplate>
            </asp:FormView>
            <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" ProviderName="<%$ ConnectionStrings:ConnectionString.ProviderName %>" SelectCommand="SELECT * FROM [Book]" InsertCommand="INSERT INTO Book(Author, Title, Price) VALUES (@Author, @Title, @Price)">
                <InsertParameters>
                    <asp:Parameter Name="Author" />
                    <asp:Parameter Name="Title" />
                    <asp:Parameter Name="Price" />
                </InsertParameters>
            </asp:SqlDataSource>
        </p>
        <p>
            &nbsp;</p>
        <p>
            Publisher</p>
        <p>
            <asp:FormView ID="FormView2" runat="server" DataKeyNames="Member_id" DataSourceID="SqlDataSource2" DefaultMode="Insert">
                <EditItemTemplate>
                    Member_id:
                    <asp:Label ID="Member_idLabel1" runat="server" Text='<%# Eval("Member_id") %>' />
                    <br />
                    Member_date:
                    <asp:TextBox ID="Member_dateTextBox" runat="server" Text='<%# Bind("Member_date") %>' />
                    <br />
                    Member_type:
                    <asp:TextBox ID="Member_typeTextBox" runat="server" Text='<%# Bind("Member_type") %>' />
                    <br />
                    Address:
                    <asp:TextBox ID="AddressTextBox" runat="server" Text='<%# Bind("Address") %>' />
                    <br />
                    Name:
                    <asp:TextBox ID="NameTextBox" runat="server" Text='<%# Bind("Name") %>' />
                    <br />
                    Expire_date:
                    <asp:TextBox ID="Expire_dateTextBox" runat="server" Text='<%# Bind("Expire_date") %>' />
                    <br />
                    <asp:LinkButton ID="UpdateButton" runat="server" CausesValidation="True" CommandName="Update" Text="Update" />
                    &nbsp;<asp:LinkButton ID="UpdateCancelButton" runat="server" CausesValidation="False" CommandName="Cancel" Text="Cancel" />
                </EditItemTemplate>
                <InsertItemTemplate>
                    Member_date:
                    <asp:TextBox ID="Member_dateTextBox" runat="server" Text='<%# Bind("Member_date") %>' />
                    <br />
                    Member_type:
                    <asp:TextBox ID="Member_typeTextBox" runat="server" Text='<%# Bind("Member_type") %>' />
                    <br />
                    Address:
                    <asp:TextBox ID="AddressTextBox" runat="server" Text='<%# Bind("Address") %>' />
                    <br />
                    Name:
                    <asp:TextBox ID="NameTextBox" runat="server" Text='<%# Bind("Name") %>' />
                    <br />
                    Expire_date:
                    <asp:TextBox ID="Expire_dateTextBox" runat="server" Text='<%# Bind("Expire_date") %>' />
                    <br />
                    <asp:LinkButton ID="InsertButton" runat="server" CausesValidation="True" CommandName="Insert" Text="Insert" />
&nbsp;<asp:LinkButton ID="InsertCancelButton" runat="server" CausesValidation="False" CommandName="Cancel" Text="Cancel" />
                </InsertItemTemplate>
                <ItemTemplate>
                    Member_id:
                    <asp:Label ID="Member_idLabel" runat="server" Text='<%# Eval("Member_id") %>' />
                    <br />
                    Member_date:
                    <asp:Label ID="Member_dateLabel" runat="server" Text='<%# Bind("Member_date") %>' />
                    <br />
                    Member_type:
                    <asp:Label ID="Member_typeLabel" runat="server" Text='<%# Bind("Member_type") %>' />
                    <br />
                    Address:
                    <asp:Label ID="AddressLabel" runat="server" Text='<%# Bind("Address") %>' />
                    <br />
                    Name:
                    <asp:Label ID="NameLabel" runat="server" Text='<%# Bind("Name") %>' />
                    <br />
                    Expire_date:
                    <asp:Label ID="Expire_dateLabel" runat="server" Text='<%# Bind("Expire_date") %>' />
                    <br />

                </ItemTemplate>
            </asp:FormView>
            <asp:SqlDataSource ID="SqlDataSource2" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" ProviderName="<%$ ConnectionStrings:ConnectionString.ProviderName %>" SelectCommand="SELECT * FROM [Member]"></asp:SqlDataSource>
        </p>
    </section>
</asp:Content>