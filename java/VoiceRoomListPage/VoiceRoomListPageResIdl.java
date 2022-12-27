package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class VoiceRoomListPageResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VoiceRoomListPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(VoiceRoomListPageResIdl voiceRoomListPageResIdl) {
            super(voiceRoomListPageResIdl);
            if (voiceRoomListPageResIdl == null) {
                return;
            }
            this.error = voiceRoomListPageResIdl.error;
            this.data = voiceRoomListPageResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VoiceRoomListPageResIdl build(boolean z) {
            return new VoiceRoomListPageResIdl(this, z);
        }
    }

    public VoiceRoomListPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
