package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class TbBookrack extends Message {
  public static final String DEFAULT_BOOKTOWN = "";
  
  public static final List<BookInfo> DEFAULT_BOOK_LIST;
  
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_TIP = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<BookInfo> book_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String booktown;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tip;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_BOOK_LIST = Collections.emptyList();
  }
  
  public TbBookrack(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.booktown;
      if (str2 == null) {
        this.booktown = "";
      } else {
        this.booktown = str2;
      } 
      Integer integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
      List<BookInfo> list = paramBuilder.book_list;
      if (list == null) {
        this.book_list = DEFAULT_BOOK_LIST;
      } else {
        this.book_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.tip;
      if (str == null) {
        this.tip = "";
      } else {
        this.tip = str;
      } 
    } else {
      this.booktown = ((Builder)str).booktown;
      this.num = ((Builder)str).num;
      this.book_list = Message.immutableCopyOf(((Builder)str).book_list);
      this.title = ((Builder)str).title;
      this.icon = ((Builder)str).icon;
      this.tip = ((Builder)str).tip;
    } 
  }
  
  public TbBookrack(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TbBookrack> {
    public List<BookInfo> book_list;
    
    public String booktown;
    
    public String icon;
    
    public Integer num;
    
    public String tip;
    
    public String title;
    
    public Builder() {}
    
    public Builder(TbBookrack param1TbBookrack) {
      super(param1TbBookrack);
      if (param1TbBookrack == null)
        return; 
      this.booktown = param1TbBookrack.booktown;
      this.num = param1TbBookrack.num;
      this.book_list = Message.copyOf(param1TbBookrack.book_list);
      this.title = param1TbBookrack.title;
      this.icon = param1TbBookrack.icon;
      this.tip = param1TbBookrack.tip;
    }
    
    public TbBookrack build(boolean param1Boolean) {
      return new TbBookrack(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
