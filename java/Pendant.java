package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Pendant extends Message {
    public static final String DEFAULT_DYNAMIC_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final Long DEFAULT_PROPS_ID = 0L;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String dynamic_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long props_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Pendant> {
        public String dynamic_url;
        public String img_url;
        public String jump_url;
        public Long props_id;

        public Builder() {
        }

        public Builder(Pendant pendant) {
            super(pendant);
            if (pendant == null) {
                return;
            }
            this.props_id = pendant.props_id;
            this.img_url = pendant.img_url;
            this.dynamic_url = pendant.dynamic_url;
            this.jump_url = pendant.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Pendant build(boolean z) {
            return new Pendant(this, z);
        }
    }

    public Pendant(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = l;
            }
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.dynamic_url;
            if (str2 == null) {
                this.dynamic_url = "";
            } else {
                this.dynamic_url = str2;
            }
            String str3 = builder.jump_url;
            if (str3 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str3;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.img_url = builder.img_url;
        this.dynamic_url = builder.dynamic_url;
        this.jump_url = builder.jump_url;
    }
}
