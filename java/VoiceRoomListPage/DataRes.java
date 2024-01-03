package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> voice_room_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> voice_room_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.voice_room_list = Message.copyOf(dataRes.voice_room_list);
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
            List<ThreadInfo> list = builder.voice_room_list;
            if (list == null) {
                this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
                return;
            } else {
                this.voice_room_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.voice_room_list = Message.immutableCopyOf(builder.voice_room_list);
    }
}
