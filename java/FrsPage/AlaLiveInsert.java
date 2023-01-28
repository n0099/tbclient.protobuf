package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class AlaLiveInsert extends Message {
  public static final List<ThreadInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> ala_live_list;
  
  public AlaLiveInsert(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.ala_live_list;
      if (list == null) {
        this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
      } else {
        this.ala_live_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.ala_live_list = Message.immutableCopyOf(((Builder)list).ala_live_list);
    } 
  }
  
  public AlaLiveInsert(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaLiveInsert> {
    public List<ThreadInfo> ala_live_list;
    
    public Builder() {}
    
    public Builder(AlaLiveInsert param1AlaLiveInsert) {
      super(param1AlaLiveInsert);
      if (param1AlaLiveInsert == null)
        return; 
      this.ala_live_list = Message.copyOf(param1AlaLiveInsert.ala_live_list);
    }
    
    public AlaLiveInsert build(boolean param1Boolean) {
      return new AlaLiveInsert(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
