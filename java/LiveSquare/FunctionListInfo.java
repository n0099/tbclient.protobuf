package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FunctionListInfo extends Message {
    public static final String DEFAULT_DESCRIBE = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String describe;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long update_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ID = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FunctionListInfo> {
        public String describe;
        public String icon;
        public Integer id;
        public String title;
        public Long update_time;
        public String url;

        public Builder() {
        }

        public Builder(FunctionListInfo functionListInfo) {
            super(functionListInfo);
            if (functionListInfo == null) {
                return;
            }
            this.id = functionListInfo.id;
            this.title = functionListInfo.title;
            this.describe = functionListInfo.describe;
            this.url = functionListInfo.url;
            this.update_time = functionListInfo.update_time;
            this.icon = functionListInfo.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FunctionListInfo build(boolean z) {
            return new FunctionListInfo(this, z);
        }
    }

    public FunctionListInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.describe;
            if (str2 == null) {
                this.describe = "";
            } else {
                this.describe = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            Long l = builder.update_time;
            if (l == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = l;
            }
            String str4 = builder.icon;
            if (str4 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str4;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.describe = builder.describe;
        this.url = builder.url;
        this.update_time = builder.update_time;
        this.icon = builder.icon;
    }
}
