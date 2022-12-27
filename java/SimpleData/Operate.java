package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Operate extends Message {
    public static final String DEFAULT_APP_NAME = "";
    public static final Integer DEFAULT_APP_STORE_ID = 0;
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String app_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer app_store_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Operate> {
        public String app_name;
        public Integer app_store_id;
        public String desc;
        public String package_name;
        public String type;
        public String url;

        public Builder() {
        }

        public Builder(Operate operate) {
            super(operate);
            if (operate == null) {
                return;
            }
            this.type = operate.type;
            this.desc = operate.desc;
            this.app_name = operate.app_name;
            this.app_store_id = operate.app_store_id;
            this.url = operate.url;
            this.package_name = operate.package_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Operate build(boolean z) {
            return new Operate(this, z);
        }
    }

    public Operate(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.app_name;
            if (str3 == null) {
                this.app_name = "";
            } else {
                this.app_name = str3;
            }
            Integer num = builder.app_store_id;
            if (num == null) {
                this.app_store_id = DEFAULT_APP_STORE_ID;
            } else {
                this.app_store_id = num;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            String str5 = builder.package_name;
            if (str5 == null) {
                this.package_name = "";
                return;
            } else {
                this.package_name = str5;
                return;
            }
        }
        this.type = builder.type;
        this.desc = builder.desc;
        this.app_name = builder.app_name;
        this.app_store_id = builder.app_store_id;
        this.url = builder.url;
        this.package_name = builder.package_name;
    }
}
