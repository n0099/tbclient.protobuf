package tbclient.AdNewLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_EXTRA1 = "";
    public static final String DEFAULT_EXTRA2 = "";
    public static final String DEFAULT_EXTRA3 = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String extra1;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String extra2;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String extra3;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String extra1;
        public String extra2;
        public String extra3;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.extra1 = dataRes.extra1;
            this.extra2 = dataRes.extra2;
            this.extra3 = dataRes.extra3;
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
            String str = builder.extra1;
            if (str == null) {
                this.extra1 = "";
            } else {
                this.extra1 = str;
            }
            String str2 = builder.extra2;
            if (str2 == null) {
                this.extra2 = "";
            } else {
                this.extra2 = str2;
            }
            String str3 = builder.extra3;
            if (str3 == null) {
                this.extra3 = "";
                return;
            } else {
                this.extra3 = str3;
                return;
            }
        }
        this.extra1 = builder.extra1;
        this.extra2 = builder.extra2;
        this.extra3 = builder.extra3;
    }
}
