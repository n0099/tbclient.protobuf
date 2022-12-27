package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<PresentGiftListByCategoryId1> DEFAULT_GIFT_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PresentGiftListByCategoryId1> gift_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<PresentGiftListByCategoryId1> gift_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.gift_list = Message.copyOf(dataRes.gift_list);
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
            List<PresentGiftListByCategoryId1> list = builder.gift_list;
            if (list == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
                return;
            } else {
                this.gift_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.gift_list = Message.immutableCopyOf(builder.gift_list);
    }
}
