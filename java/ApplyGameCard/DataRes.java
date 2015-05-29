package tbclient.ApplyGameCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_GAME_CODE = "";
    public static final String DEFAULT_GIFT_CODE = "";
    public static final Integer DEFAULT_STATUS_CODE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_code;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String gift_code;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status_code;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.status_code == null) {
                this.status_code = DEFAULT_STATUS_CODE;
            } else {
                this.status_code = builder.status_code;
            }
            if (builder.game_code == null) {
                this.game_code = "";
            } else {
                this.game_code = builder.game_code;
            }
            if (builder.gift_code == null) {
                this.gift_code = "";
                return;
            } else {
                this.gift_code = builder.gift_code;
                return;
            }
        }
        this.status_code = builder.status_code;
        this.game_code = builder.game_code;
        this.gift_code = builder.gift_code;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public String game_code;
        public String gift_code;
        public Integer status_code;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.status_code = dataRes.status_code;
                this.game_code = dataRes.game_code;
                this.gift_code = dataRes.gift_code;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
