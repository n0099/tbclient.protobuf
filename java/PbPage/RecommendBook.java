package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecommendBook extends Message {
  public static final String DEFAULT_BOOK_COVER = "";
  
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final List<String> DEFAULT_BOOK_TIPS;
  
  public static final String DEFAULT_BOOK_TITLE = "";
  
  public static final Integer DEFAULT_BOOK_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_BOTTON_TEXT = "";
  
  public static final String DEFAULT_RECOMMEND_TEXT = "";
  
  public static final String DEFAULT_SUBSCRIPT_ICON = "";
  
  public static final String DEFAULT_SUGGEST_TEXT = "";
  
  public static final String DEFAULT_SUGGEST_URL = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String book_cover;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> book_tips;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String book_title;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer book_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String botton_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recommend_text;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String subscript_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String suggest_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String suggest_url;
  
  static {
    DEFAULT_BOOK_TIPS = Collections.emptyList();
  }
  
  public RecommendBook(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.recommend_text;
      if (str3 == null) {
        this.recommend_text = "";
      } else {
        this.recommend_text = str3;
      } 
      str3 = paramBuilder.suggest_text;
      if (str3 == null) {
        this.suggest_text = "";
      } else {
        this.suggest_text = str3;
      } 
      str3 = paramBuilder.suggest_url;
      if (str3 == null) {
        this.suggest_url = "";
      } else {
        this.suggest_url = str3;
      } 
      str3 = paramBuilder.book_id;
      if (str3 == null) {
        this.book_id = "";
      } else {
        this.book_id = str3;
      } 
      Integer integer = paramBuilder.book_type;
      if (integer == null) {
        this.book_type = DEFAULT_BOOK_TYPE;
      } else {
        this.book_type = integer;
      } 
      String str2 = paramBuilder.book_cover;
      if (str2 == null) {
        this.book_cover = "";
      } else {
        this.book_cover = str2;
      } 
      str2 = paramBuilder.book_title;
      if (str2 == null) {
        this.book_title = "";
      } else {
        this.book_title = str2;
      } 
      List<String> list = paramBuilder.book_tips;
      if (list == null) {
        this.book_tips = DEFAULT_BOOK_TIPS;
      } else {
        this.book_tips = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.botton_text;
      if (str1 == null) {
        this.botton_text = "";
      } else {
        this.botton_text = str1;
      } 
      str = paramBuilder.subscript_icon;
      if (str == null) {
        this.subscript_icon = "";
      } else {
        this.subscript_icon = str;
      } 
    } else {
      this.recommend_text = ((Builder)str).recommend_text;
      this.suggest_text = ((Builder)str).suggest_text;
      this.suggest_url = ((Builder)str).suggest_url;
      this.book_id = ((Builder)str).book_id;
      this.book_type = ((Builder)str).book_type;
      this.book_cover = ((Builder)str).book_cover;
      this.book_title = ((Builder)str).book_title;
      this.book_tips = Message.immutableCopyOf(((Builder)str).book_tips);
      this.botton_text = ((Builder)str).botton_text;
      this.subscript_icon = ((Builder)str).subscript_icon;
    } 
  }
  
  public RecommendBook(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendBook> {
    public String book_cover;
    
    public String book_id;
    
    public List<String> book_tips;
    
    public String book_title;
    
    public Integer book_type;
    
    public String botton_text;
    
    public String recommend_text;
    
    public String subscript_icon;
    
    public String suggest_text;
    
    public String suggest_url;
    
    public Builder() {}
    
    public Builder(RecommendBook param1RecommendBook) {
      super(param1RecommendBook);
      if (param1RecommendBook == null)
        return; 
      this.recommend_text = param1RecommendBook.recommend_text;
      this.suggest_text = param1RecommendBook.suggest_text;
      this.suggest_url = param1RecommendBook.suggest_url;
      this.book_id = param1RecommendBook.book_id;
      this.book_type = param1RecommendBook.book_type;
      this.book_cover = param1RecommendBook.book_cover;
      this.book_title = param1RecommendBook.book_title;
      this.book_tips = Message.copyOf(param1RecommendBook.book_tips);
      this.botton_text = param1RecommendBook.botton_text;
      this.subscript_icon = param1RecommendBook.subscript_icon;
    }
    
    public RecommendBook build(boolean param1Boolean) {
      return new RecommendBook(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
