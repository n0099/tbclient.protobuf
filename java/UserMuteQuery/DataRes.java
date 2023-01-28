package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;

public final class DataRes extends Message {
  public static final List<MuteUser> DEFAULT_MUTE_USER = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<MuteUser> mute_user;
  
  @ProtoField(tag = 2)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<MuteUser> list = paramBuilder.mute_user;
      if (list == null) {
        this.mute_user = DEFAULT_MUTE_USER;
      } else {
        this.mute_user = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.mute_user = Message.immutableCopyOf(paramBuilder.mute_user);
      this.page = paramBuilder.page;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<MuteUser> mute_user;
    
    public Page page;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.mute_user = Message.copyOf(param1DataRes.mute_user);
      this.page = param1DataRes.page;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
