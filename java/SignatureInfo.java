package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SignatureInfo extends Message {
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_NAME = "";
    public static final String DEFAULT_PLAYER = "";
    public static final String DEFAULT_POWER = "";
    public static final String DEFAULT_SERVER = "";
    @ProtoField(tag = 5)
    public final Avatar avatar;
    @ProtoField(tag = 1)
    public final Equipment equipment;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String game_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String player;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String power;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String server;

    private SignatureInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.equipment = builder.equipment;
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.game_name == null) {
                this.game_name = "";
            } else {
                this.game_name = builder.game_name;
            }
            if (builder.player == null) {
                this.player = "";
            } else {
                this.player = builder.player;
            }
            this.avatar = builder.avatar;
            if (builder.power == null) {
                this.power = "";
            } else {
                this.power = builder.power;
            }
            if (builder.server == null) {
                this.server = "";
                return;
            } else {
                this.server = builder.server;
                return;
            }
        }
        this.equipment = builder.equipment;
        this.game_id = builder.game_id;
        this.game_name = builder.game_name;
        this.player = builder.player;
        this.avatar = builder.avatar;
        this.power = builder.power;
        this.server = builder.server;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SignatureInfo> {
        public Avatar avatar;
        public Equipment equipment;
        public String game_id;
        public String game_name;
        public String player;
        public String power;
        public String server;

        public Builder() {
        }

        public Builder(SignatureInfo signatureInfo) {
            super(signatureInfo);
            if (signatureInfo != null) {
                this.equipment = signatureInfo.equipment;
                this.game_id = signatureInfo.game_id;
                this.game_name = signatureInfo.game_name;
                this.player = signatureInfo.player;
                this.avatar = signatureInfo.avatar;
                this.power = signatureInfo.power;
                this.server = signatureInfo.server;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignatureInfo build(boolean z) {
            return new SignatureInfo(this, z);
        }
    }
}
