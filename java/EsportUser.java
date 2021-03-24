package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class EsportUser extends Message {
    public static final String DEFAULT_STEAM_NAME = "";
    public static final String DEFAULT_STEAM_PORTRAIT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String steam_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String steam_portrait;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<EsportUser> {
        public String steam_name;
        public String steam_portrait;

        public Builder() {
        }

        public Builder(EsportUser esportUser) {
            super(esportUser);
            if (esportUser == null) {
                return;
            }
            this.steam_name = esportUser.steam_name;
            this.steam_portrait = esportUser.steam_portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EsportUser build(boolean z) {
            return new EsportUser(this, z);
        }
    }

    public EsportUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.steam_name;
            if (str == null) {
                this.steam_name = "";
            } else {
                this.steam_name = str;
            }
            String str2 = builder.steam_portrait;
            if (str2 == null) {
                this.steam_portrait = "";
                return;
            } else {
                this.steam_portrait = str2;
                return;
            }
        }
        this.steam_name = builder.steam_name;
        this.steam_portrait = builder.steam_portrait;
    }
}
