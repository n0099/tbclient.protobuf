package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class VoiceRoom extends Message {
    public static final String DEFAULT_ROOM_NAME = "";
    @ProtoField(tag = 4)
    public final User author;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long joined_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long room_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String room_name;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<User> talker;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long talker_num;
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final List<User> DEFAULT_TALKER = Collections.emptyList();
    public static final Long DEFAULT_JOINED_NUM = 0L;
    public static final Long DEFAULT_TALKER_NUM = 0L;
    public static final Integer DEFAULT_STATUS = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VoiceRoom> {
        public User author;
        public Long joined_num;
        public Long room_id;
        public String room_name;
        public Integer status;
        public List<User> talker;
        public Long talker_num;

        public Builder() {
        }

        public Builder(VoiceRoom voiceRoom) {
            super(voiceRoom);
            if (voiceRoom == null) {
                return;
            }
            this.room_id = voiceRoom.room_id;
            this.author = voiceRoom.author;
            this.talker = Message.copyOf(voiceRoom.talker);
            this.joined_num = voiceRoom.joined_num;
            this.talker_num = voiceRoom.talker_num;
            this.status = voiceRoom.status;
            this.room_name = voiceRoom.room_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VoiceRoom build(boolean z) {
            return new VoiceRoom(this, z);
        }
    }

    public VoiceRoom(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.room_id;
            if (l == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = l;
            }
            this.author = builder.author;
            List<User> list = builder.talker;
            if (list == null) {
                this.talker = DEFAULT_TALKER;
            } else {
                this.talker = Message.immutableCopyOf(list);
            }
            Long l2 = builder.joined_num;
            if (l2 == null) {
                this.joined_num = DEFAULT_JOINED_NUM;
            } else {
                this.joined_num = l2;
            }
            Long l3 = builder.talker_num;
            if (l3 == null) {
                this.talker_num = DEFAULT_TALKER_NUM;
            } else {
                this.talker_num = l3;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            String str = builder.room_name;
            if (str == null) {
                this.room_name = "";
                return;
            } else {
                this.room_name = str;
                return;
            }
        }
        this.room_id = builder.room_id;
        this.author = builder.author;
        this.talker = Message.immutableCopyOf(builder.talker);
        this.joined_num = builder.joined_num;
        this.talker_num = builder.talker_num;
        this.status = builder.status;
        this.room_name = builder.room_name;
    }
}
