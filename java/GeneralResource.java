package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class GeneralResource extends Message {
    public static final Integer DEFAULT_RES_FLOOR = 0;
    public static final String DEFAULT_RES_IMAGE = "";
    public static final String DEFAULT_RES_LINK = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer res_floor;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String res_image;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String res_link;

    private GeneralResource(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.res_image == null) {
                this.res_image = "";
            } else {
                this.res_image = builder.res_image;
            }
            if (builder.res_link == null) {
                this.res_link = "";
            } else {
                this.res_link = builder.res_link;
            }
            if (builder.res_floor == null) {
                this.res_floor = DEFAULT_RES_FLOOR;
                return;
            } else {
                this.res_floor = builder.res_floor;
                return;
            }
        }
        this.res_image = builder.res_image;
        this.res_link = builder.res_link;
        this.res_floor = builder.res_floor;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<GeneralResource> {
        public Integer res_floor;
        public String res_image;
        public String res_link;

        public Builder() {
        }

        public Builder(GeneralResource generalResource) {
            super(generalResource);
            if (generalResource != null) {
                this.res_image = generalResource.res_image;
                this.res_link = generalResource.res_link;
                this.res_floor = generalResource.res_floor;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GeneralResource build(boolean z) {
            return new GeneralResource(this, z);
        }
    }
}
