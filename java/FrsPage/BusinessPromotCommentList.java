package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BusinessPromotCommentList extends Message {
  public static final Integer DEFAULT_IS_LZ;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  public static final String DEFAULT_USERNAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_lz;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String username;
  
  static {
    DEFAULT_IS_LZ = Integer.valueOf(0);
  }
  
  public BusinessPromotCommentList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.username;
      if (str == null) {
        this.username = "";
      } else {
        this.username = str;
      } 
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      integer = paramBuilder.is_lz;
      if (integer == null) {
        this.is_lz = DEFAULT_IS_LZ;
      } else {
        this.is_lz = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.username = ((Builder)integer).username;
      this.uid = ((Builder)integer).uid;
      this.is_lz = ((Builder)integer).is_lz;
    } 
  }
  
  public BusinessPromotCommentList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BusinessPromotCommentList> {
    public Integer is_lz;
    
    public String title;
    
    public Long uid;
    
    public String username;
    
    public Builder() {}
    
    public Builder(BusinessPromotCommentList param1BusinessPromotCommentList) {
      super(param1BusinessPromotCommentList);
      if (param1BusinessPromotCommentList == null)
        return; 
      this.title = param1BusinessPromotCommentList.title;
      this.username = param1BusinessPromotCommentList.username;
      this.uid = param1BusinessPromotCommentList.uid;
      this.is_lz = param1BusinessPromotCommentList.is_lz;
    }
    
    public BusinessPromotCommentList build(boolean param1Boolean) {
      return new BusinessPromotCommentList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
