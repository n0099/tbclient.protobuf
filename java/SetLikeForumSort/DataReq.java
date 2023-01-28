package tbclient.SetLikeForumSort;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_NEW_LIKE_LIST = "";
  
  public static final String DEFAULT_ORIGINAL_LIKE_LIST = "";
  
  public static final String DEFAULT_TBS = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String new_like_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String original_like_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tbs;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.original_like_list;
      if (str1 == null) {
        this.original_like_list = "";
      } else {
        this.original_like_list = str1;
      } 
      str1 = paramBuilder.new_like_list;
      if (str1 == null) {
        this.new_like_list = "";
      } else {
        this.new_like_list = str1;
      } 
      str = paramBuilder.tbs;
      if (str == null) {
        this.tbs = "";
      } else {
        this.tbs = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.original_like_list = ((Builder)str).original_like_list;
      this.new_like_list = ((Builder)str).new_like_list;
      this.tbs = ((Builder)str).tbs;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public String new_like_list;
    
    public String original_like_list;
    
    public String tbs;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.original_like_list = param1DataReq.original_like_list;
      this.new_like_list = param1DataReq.new_like_list;
      this.tbs = param1DataReq.tbs;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
