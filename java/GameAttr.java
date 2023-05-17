package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GameAttr extends Message {
    public static final String DEFAULT_IS_OPEN = "";
    public static final String DEFAULT_USER_ID = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String is_open;
    @ProtoField(tag = 2)
    public final SignatureInfo signature_info;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_id;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GameAttr> {
        public String is_open;
        public SignatureInfo signature_info;
        public String user_id;

        public Builder() {
        }

        public Builder(GameAttr gameAttr) {
            super(gameAttr);
            if (gameAttr == null) {
                return;
            }
            this.user_id = gameAttr.user_id;
            this.signature_info = gameAttr.signature_info;
            this.is_open = gameAttr.is_open;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameAttr build(boolean z) {
            return new GameAttr(this, z);
        }
    }

    public GameAttr(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.user_id;
            if (str == null) {
                this.user_id = "";
            } else {
                this.user_id = str;
            }
            this.signature_info = builder.signature_info;
            String str2 = builder.is_open;
            if (str2 == null) {
                this.is_open = "";
                return;
            } else {
                this.is_open = str2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.signature_info = builder.signature_info;
        this.is_open = builder.is_open;
    }
}
