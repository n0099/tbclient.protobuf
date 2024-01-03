package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<AlaLiveInfo> DEFAULT_LIVE_FOLLOW_SECOND_FLOOR = Collections.emptyList();
    public static final List<AlaLiveInfo> DEFAULT_LIVE_INDEX_SECOND_FLOOR = Collections.emptyList();
    public static final List<AlaLiveInfo> DEFAULT_LIVE_PIC_SECOND_FLOOR = Collections.emptyList();
    public static final String DEFAULT_UNIQ_ID = "";
    @ProtoField(tag = 12)
    public final MemberBroadcastInfo activity_broadcast;
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public MemberBroadcastInfo activity_broadcast;
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

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.live = dataRes.live;
            this.level = dataRes.level;
            this.icon = dataRes.icon;
            this.live_follow_second_floor = Message.copyOf(dataRes.live_follow_second_floor);
            this.live_index_second_floor = Message.copyOf(dataRes.live_index_second_floor);
            this.live_pic_second_floor = Message.copyOf(dataRes.live_pic_second_floor);
            this.chatroom_frs = dataRes.chatroom_frs;
            this.uniq_id = dataRes.uniq_id;
            this.chatroom_message_tab = dataRes.chatroom_message_tab;
            this.member_broadcast = dataRes.member_broadcast;
            this.festival_info = dataRes.festival_info;
            this.activity_broadcast = dataRes.activity_broadcast;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.live = builder.live;
            this.level = builder.level;
            this.icon = builder.icon;
            List<AlaLiveInfo> list = builder.live_follow_second_floor;
            if (list == null) {
                this.live_follow_second_floor = DEFAULT_LIVE_FOLLOW_SECOND_FLOOR;
            } else {
                this.live_follow_second_floor = Message.immutableCopyOf(list);
            }
            List<AlaLiveInfo> list2 = builder.live_index_second_floor;
            if (list2 == null) {
                this.live_index_second_floor = DEFAULT_LIVE_INDEX_SECOND_FLOOR;
            } else {
                this.live_index_second_floor = Message.immutableCopyOf(list2);
            }
            List<AlaLiveInfo> list3 = builder.live_pic_second_floor;
            if (list3 == null) {
                this.live_pic_second_floor = DEFAULT_LIVE_PIC_SECOND_FLOOR;
            } else {
                this.live_pic_second_floor = Message.immutableCopyOf(list3);
            }
            this.chatroom_frs = builder.chatroom_frs;
            String str = builder.uniq_id;
            if (str == null) {
                this.uniq_id = "";
            } else {
                this.uniq_id = str;
            }
            this.chatroom_message_tab = builder.chatroom_message_tab;
            this.member_broadcast = builder.member_broadcast;
            this.festival_info = builder.festival_info;
            this.activity_broadcast = builder.activity_broadcast;
            return;
        }
        this.live = builder.live;
        this.level = builder.level;
        this.icon = builder.icon;
        this.live_follow_second_floor = Message.immutableCopyOf(builder.live_follow_second_floor);
        this.live_index_second_floor = Message.immutableCopyOf(builder.live_index_second_floor);
        this.live_pic_second_floor = Message.immutableCopyOf(builder.live_pic_second_floor);
        this.chatroom_frs = builder.chatroom_frs;
        this.uniq_id = builder.uniq_id;
        this.chatroom_message_tab = builder.chatroom_message_tab;
        this.member_broadcast = builder.member_broadcast;
        this.festival_info = builder.festival_info;
        this.activity_broadcast = builder.activity_broadcast;
    }
}
