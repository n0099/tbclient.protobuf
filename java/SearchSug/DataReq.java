package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_ISFORUM = "";
  
  public static final String DEFAULT_WORD = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String isforum;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String word;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.word;
      if (str1 == null) {
        this.word = "";
      } else {
        this.word = str1;
      } 
      str = paramBuilder.isforum;
      if (str == null) {
        this.isforum = "";
      } else {
        this.isforum = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.word = ((Builder)str).word;
      this.isforum = ((Builder)str).isforum;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public String isforum;
    
    public String word;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.word = param1DataReq.word;
      this.isforum = param1DataReq.isforum;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
