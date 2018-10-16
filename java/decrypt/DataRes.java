package tbclient.decrypt;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_BTN_CANCEL = "";
    public static final String DEFAULT_BTN_SURE = "";
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String btn_cancel;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btn_sure;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.img == null) {
                this.img = "";
            } else {
                this.img = builder.img;
            }
            if (builder.tips == null) {
                this.tips = "";
            } else {
                this.tips = builder.tips;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.btn_sure == null) {
                this.btn_sure = "";
            } else {
                this.btn_sure = builder.btn_sure;
            }
            if (builder.btn_cancel == null) {
                this.btn_cancel = "";
                return;
            } else {
                this.btn_cancel = builder.btn_cancel;
                return;
            }
        }
        this.title = builder.title;
        this.img = builder.img;
        this.tips = builder.tips;
        this.url = builder.url;
        this.btn_sure = builder.btn_sure;
        this.btn_cancel = builder.btn_cancel;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String btn_cancel;
        public String btn_sure;
        public String img;
        public String tips;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.title = dataRes.title;
                this.img = dataRes.img;
                this.tips = dataRes.tips;
                this.url = dataRes.url;
                this.btn_sure = dataRes.btn_sure;
                this.btn_cancel = dataRes.btn_cancel;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
