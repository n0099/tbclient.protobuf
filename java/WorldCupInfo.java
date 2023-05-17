package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class WorldCupInfo extends Message {
    public static final String DEFAULT_AVATAR_TEAMFLAG_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar_teamflag_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<WorldCupInfo> {
        public String avatar_teamflag_url;

        public Builder() {
        }

        public Builder(WorldCupInfo worldCupInfo) {
            super(worldCupInfo);
            if (worldCupInfo == null) {
                return;
            }
            this.avatar_teamflag_url = worldCupInfo.avatar_teamflag_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupInfo build(boolean z) {
            return new WorldCupInfo(this, z);
        }
    }

    public WorldCupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.avatar_teamflag_url;
            if (str == null) {
                this.avatar_teamflag_url = "";
                return;
            } else {
                this.avatar_teamflag_url = str;
                return;
            }
        }
        this.avatar_teamflag_url = builder.avatar_teamflag_url;
    }
}
