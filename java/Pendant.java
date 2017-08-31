package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Pendant extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final Long DEFAULT_PROPS_ID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long props_id;

    private Pendant(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.img_url == null) {
                this.img_url = "";
                return;
            } else {
                this.img_url = builder.img_url;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.img_url = builder.img_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Pendant> {
        public String img_url;
        public Long props_id;

        public Builder() {
        }

        public Builder(Pendant pendant) {
            super(pendant);
            if (pendant != null) {
                this.props_id = pendant.props_id;
                this.img_url = pendant.img_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Pendant build(boolean z) {
            return new Pendant(this, z);
        }
    }
}