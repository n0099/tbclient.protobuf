package tbclient.SetUserBlack;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
import tbclient.PermissionList;

public final class DataReq extends Message {
  public static final Long DEFAULT_BLACK_UID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long black_uid;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3)
  public final PermissionList perm_list;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.black_uid;
      if (long_ == null) {
        this.black_uid = DEFAULT_BLACK_UID;
      } else {
        this.black_uid = long_;
      } 
      this.perm_list = paramBuilder.perm_list;
    } else {
      this.common = paramBuilder.common;
      this.black_uid = paramBuilder.black_uid;
      this.perm_list = paramBuilder.perm_list;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Long black_uid;
    
    public CommonReq common;
    
    public PermissionList perm_list;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.black_uid = param1DataReq.black_uid;
      this.perm_list = param1DataReq.perm_list;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
