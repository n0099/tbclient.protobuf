package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;

public final class DataRes extends Message {
  public static final List<AlaLiveInfo> DEFAULT_LIVE_FOLLOW_SECOND_FLOOR = Collections.emptyList();
  
  public static final List<AlaLiveInfo> DEFAULT_LIVE_INDEX_SECOND_FLOOR = Collections.emptyList();
  
  public static final List<AlaLiveInfo> DEFAULT_LIVE_PIC_SECOND_FLOOR = Collections.emptyList();
  
  public static final String DEFAULT_UNIQ_ID = "";
  
  @ProtoField(tag = 7)
  public final ChatroomFrsRes chatroom_frs;
  
  @ProtoField(tag = 9)
  public final ChatroomMessageTabData chatroom_message_tab;
  
  @ProtoField(tag = 11)
  public final FestivalInfo festival_info;
  
  @ProtoField(tag = 3)
  public final IconRes icon;
  
  @ProtoField(tag = 2)
  public final LevelRes level;
  
  @ProtoField(tag = 1)
  public final LiveRes live;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<AlaLiveInfo> live_follow_second_floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<AlaLiveInfo> live_index_second_floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<AlaLiveInfo> live_pic_second_floor;
  
  @ProtoField(tag = 10)
  public final MemberBroadcastInfo member_broadcast;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String uniq_id;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.live = paramBuilder.live;
      this.level = paramBuilder.level;
      this.icon = paramBuilder.icon;
      List<AlaLiveInfo> list = paramBuilder.live_follow_second_floor;
      if (list == null) {
        this.live_follow_second_floor = DEFAULT_LIVE_FOLLOW_SECOND_FLOOR;
      } else {
        this.live_follow_second_floor = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.live_index_second_floor;
      if (list == null) {
        this.live_index_second_floor = DEFAULT_LIVE_INDEX_SECOND_FLOOR;
      } else {
        this.live_index_second_floor = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.live_pic_second_floor;
      if (list == null) {
        this.live_pic_second_floor = DEFAULT_LIVE_PIC_SECOND_FLOOR;
      } else {
        this.live_pic_second_floor = Message.immutableCopyOf(list);
      } 
      this.chatroom_frs = paramBuilder.chatroom_frs;
      String str = paramBuilder.uniq_id;
      if (str == null) {
        this.uniq_id = "";
      } else {
        this.uniq_id = str;
      } 
      this.chatroom_message_tab = paramBuilder.chatroom_message_tab;
      this.member_broadcast = paramBuilder.member_broadcast;
      this.festival_info = paramBuilder.festival_info;
    } else {
      this.live = paramBuilder.live;
      this.level = paramBuilder.level;
      this.icon = paramBuilder.icon;
      this.live_follow_second_floor = Message.immutableCopyOf(paramBuilder.live_follow_second_floor);
      this.live_index_second_floor = Message.immutableCopyOf(paramBuilder.live_index_second_floor);
      this.live_pic_second_floor = Message.immutableCopyOf(paramBuilder.live_pic_second_floor);
      this.chatroom_frs = paramBuilder.chatroom_frs;
      this.uniq_id = paramBuilder.uniq_id;
      this.chatroom_message_tab = paramBuilder.chatroom_message_tab;
      this.member_broadcast = paramBuilder.member_broadcast;
      this.festival_info = paramBuilder.festival_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ChatroomFrsRes chatroom_frs;
    
    public ChatroomMessageTabData chatroom_message_tab;
    
    public FestivalInfo festival_info;
    
    public IconRes icon;
    
    public LevelRes level;
    
    public LiveRes live;
    
    public List<AlaLiveInfo> live_follow_second_floor;
    
    public List<AlaLiveInfo> live_index_second_floor;
    
    public List<AlaLiveInfo> live_pic_second_floor;
    
    public MemberBroadcastInfo member_broadcast;
    
    public String uniq_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.live = param1DataRes.live;
      this.level = param1DataRes.level;
      this.icon = param1DataRes.icon;
      this.live_follow_second_floor = Message.copyOf(param1DataRes.live_follow_second_floor);
      this.live_index_second_floor = Message.copyOf(param1DataRes.live_index_second_floor);
      this.live_pic_second_floor = Message.copyOf(param1DataRes.live_pic_second_floor);
      this.chatroom_frs = param1DataRes.chatroom_frs;
      this.uniq_id = param1DataRes.uniq_id;
      this.chatroom_message_tab = param1DataRes.chatroom_message_tab;
      this.member_broadcast = param1DataRes.member_broadcast;
      this.festival_info = param1DataRes.festival_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
