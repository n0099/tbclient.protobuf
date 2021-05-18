package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class AdParam extends Message {
    public static final Integer DEFAULT_LOAD_COUNT = 0;
    public static final Integer DEFAULT_REFRESH_COUNT = 0;
    public static final String DEFAULT_YOGA_LIB_VERSION = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer load_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer refresh_count;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String yoga_lib_version;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AdParam> {
        public Integer load_count;
        public Integer refresh_count;
        public String yoga_lib_version;

        public Builder() {
        }

        public Builder(AdParam adParam) {
            super(adParam);
            if (adParam == null) {
                return;
            }
            this.load_count = adParam.load_count;
            this.refresh_count = adParam.refresh_count;
            this.yoga_lib_version = adParam.yoga_lib_version;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdParam build(boolean z) {
            return new AdParam(this, z);
        }
    }

    public AdParam(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.load_count;
            if (num == null) {
                this.load_count = DEFAULT_LOAD_COUNT;
            } else {
                this.load_count = num;
            }
            Integer num2 = builder.refresh_count;
            if (num2 == null) {
                this.refresh_count = DEFAULT_REFRESH_COUNT;
            } else {
                this.refresh_count = num2;
            }
            String str = builder.yoga_lib_version;
            if (str == null) {
                this.yoga_lib_version = "";
                return;
            } else {
                this.yoga_lib_version = str;
                return;
            }
        }
        this.load_count = builder.load_count;
        this.refresh_count = builder.refresh_count;
        this.yoga_lib_version = builder.yoga_lib_version;
    }
}
