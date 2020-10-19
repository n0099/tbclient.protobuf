package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class EsportUser extends Message {
    public static final String DEFAULT_STEAM_NAME = "";
    public static final String DEFAULT_STEAM_PORTRAIT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String steam_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String steam_portrait;

    private EsportUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.steam_name == null) {
                this.steam_name = "";
            } else {
                this.steam_name = builder.steam_name;
            }
            if (builder.steam_portrait == null) {
                this.steam_portrait = "";
                return;
            } else {
                this.steam_portrait = builder.steam_portrait;
                return;
            }
        }
        this.steam_name = builder.steam_name;
        this.steam_portrait = builder.steam_portrait;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<EsportUser> {
        public String steam_name;
        public String steam_portrait;

        public Builder() {
        }

        public Builder(EsportUser esportUser) {
            super(esportUser);
            if (esportUser != null) {
                this.steam_name = esportUser.steam_name;
                this.steam_portrait = esportUser.steam_portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EsportUser build(boolean z) {
            return new EsportUser(this, z);
        }
    }
}
