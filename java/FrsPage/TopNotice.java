package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopNotice extends Message {
  public static final String DEFAULT_AUTHOR = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TITLE_LINK = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title_link;
  
  public TopNotice(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.title_link;
      if (str == null) {
        this.title_link = "";
      } else {
        this.title_link = str;
      } 
      str = paramBuilder.author;
      if (str == null) {
        this.author = "";
      } else {
        this.author = str;
      } 
      integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.title_link = ((Builder)integer).title_link;
      this.author = ((Builder)integer).author;
      this.id = ((Builder)integer).id;
    } 
  }
  
  public TopNotice(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopNotice> {
    public String author;
    
    public Integer id;
    
    public String title;
    
    public String title_link;
    
    public Builder() {}
    
    public Builder(TopNotice param1TopNotice) {
      super(param1TopNotice);
      if (param1TopNotice == null)
        return; 
      this.title = param1TopNotice.title;
      this.title_link = param1TopNotice.title_link;
      this.author = param1TopNotice.author;
      this.id = param1TopNotice.id;
    }
    
    public TopNotice build(boolean param1Boolean) {
      return new TopNotice(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
