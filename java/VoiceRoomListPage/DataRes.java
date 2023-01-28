package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> voice_room_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.voice_room_list;
      if (list == null) {
        this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
      } else {
        this.voice_room_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.voice_room_list = Message.immutableCopyOf(((Builder)list).voice_room_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ThreadInfo> voice_room_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.voice_room_list = Message.copyOf(param1DataRes.voice_room_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
