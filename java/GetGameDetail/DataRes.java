package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final GameInfo game_info;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.game_info = builder.game_info;
        } else {
            this.game_info = builder.game_info;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public GameInfo game_info;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.game_info = dataRes.game_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
