package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_BTN_CANCEL = "";
    public static final String DEFAULT_BTN_SURE = "";
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer acitivity_id;
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
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ACITIVITY_ID = 0;
    public static final Integer DEFAULT_TYPE = 0;

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
            } else {
                this.btn_cancel = builder.btn_cancel;
            }
            if (builder.acitivity_id == null) {
                this.acitivity_id = DEFAULT_ACITIVITY_ID;
            } else {
                this.acitivity_id = builder.acitivity_id;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.title = builder.title;
        this.img = builder.img;
        this.tips = builder.tips;
        this.url = builder.url;
        this.btn_sure = builder.btn_sure;
        this.btn_cancel = builder.btn_cancel;
        this.acitivity_id = builder.acitivity_id;
        this.type = builder.type;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer acitivity_id;
        public String btn_cancel;
        public String btn_sure;
        public String img;
        public String tips;
        public String title;
        public Integer type;
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
                this.acitivity_id = dataRes.acitivity_id;
                this.type = dataRes.type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
