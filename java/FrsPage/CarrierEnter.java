package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (carrierEnter == null) {
                return;
            }
            this.title = carrierEnter.title;
            this.text = carrierEnter.text;
            this.headline_cover = carrierEnter.headline_cover;
            this.url = carrierEnter.url;
            this.obj_id = carrierEnter.obj_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CarrierEnter build(boolean z) {
            return new CarrierEnter(this, z);
        }
    }

    public CarrierEnter(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
            } else {
                this.text = str2;
            }
            String str3 = builder.headline_cover;
            if (str3 == null) {
                this.headline_cover = "";
            } else {
                this.headline_cover = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            String str5 = builder.obj_id;
            if (str5 == null) {
                this.obj_id = "";
                return;
            } else {
                this.obj_id = str5;
                return;
            }
        }
        this.title = builder.title;
        this.text = builder.text;
        this.headline_cover = builder.headline_cover;
        this.url = builder.url;
        this.obj_id = builder.obj_id;
    }
}
