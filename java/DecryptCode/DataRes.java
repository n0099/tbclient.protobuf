package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
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

    /* loaded from: classes10.dex */
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
            if (dataRes == null) {
                return;
            }
            this.title = dataRes.title;
            this.img = dataRes.img;
            this.tips = dataRes.tips;
            this.url = dataRes.url;
            this.btn_sure = dataRes.btn_sure;
            this.btn_cancel = dataRes.btn_cancel;
            this.acitivity_id = dataRes.acitivity_id;
            this.type = dataRes.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.img;
            if (str2 == null) {
                this.img = "";
            } else {
                this.img = str2;
            }
            String str3 = builder.tips;
            if (str3 == null) {
                this.tips = "";
            } else {
                this.tips = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            String str5 = builder.btn_sure;
            if (str5 == null) {
                this.btn_sure = "";
            } else {
                this.btn_sure = str5;
            }
            String str6 = builder.btn_cancel;
            if (str6 == null) {
                this.btn_cancel = "";
            } else {
                this.btn_cancel = str6;
            }
            Integer num = builder.acitivity_id;
            if (num == null) {
                this.acitivity_id = DEFAULT_ACITIVITY_ID;
            } else {
                this.acitivity_id = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num2;
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
}
