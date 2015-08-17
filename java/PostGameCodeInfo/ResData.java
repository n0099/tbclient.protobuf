package tbclient.PostGameCodeInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ResData extends Message {
    public static final String DEFAULT_CODE = "";
    public static final Integer DEFAULT_MONEY = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String code;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer money;

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.money == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = builder.money;
            }
            if (builder.code == null) {
                this.code = "";
                return;
            } else {
                this.code = builder.code;
                return;
            }
        }
        this.money = builder.money;
        this.code = builder.code;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public String code;
        public Integer money;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.money = resData.money;
                this.code = resData.code;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
