package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class CarrierEnter extends Message {
    public static final String DEFAULT_HEADLINE_COVER = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String headline_cover;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    private CarrierEnter(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.headline_cover == null) {
                this.headline_cover = "";
            } else {
                this.headline_cover = builder.headline_cover;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.obj_id == null) {
                this.obj_id = "";
                return;
            } else {
                this.obj_id = builder.obj_id;
                return;
            }
        }
        this.title = builder.title;
        this.text = builder.text;
        this.headline_cover = builder.headline_cover;
        this.url = builder.url;
        this.obj_id = builder.obj_id;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<CarrierEnter> {
        public String headline_cover;
        public String obj_id;
        public String text;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(CarrierEnter carrierEnter) {
            super(carrierEnter);
            if (carrierEnter != null) {
                this.title = carrierEnter.title;
                this.text = carrierEnter.text;
                this.headline_cover = carrierEnter.headline_cover;
                this.url = carrierEnter.url;
                this.obj_id = carrierEnter.obj_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CarrierEnter build(boolean z) {
            return new CarrierEnter(this, z);
        }
    }
}
