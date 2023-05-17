package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ManageInfo extends Message {
    public static final Integer DEFAULT_ITEM_SOURCE = 0;
    @ProtoField(tag = 1)
    public final Item item;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer item_source;
    @ProtoField(tag = 2)
    public final TiebaPlusInfo tiebaplus_info;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ManageInfo> {
        public Item item;
        public Integer item_source;
        public TiebaPlusInfo tiebaplus_info;

        public Builder() {
        }

        public Builder(ManageInfo manageInfo) {
            super(manageInfo);
            if (manageInfo == null) {
                return;
            }
            this.item = manageInfo.item;
            this.tiebaplus_info = manageInfo.tiebaplus_info;
            this.item_source = manageInfo.item_source;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ManageInfo build(boolean z) {
            return new ManageInfo(this, z);
        }
    }

    public ManageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.item = builder.item;
            this.tiebaplus_info = builder.tiebaplus_info;
            Integer num = builder.item_source;
            if (num == null) {
                this.item_source = DEFAULT_ITEM_SOURCE;
                return;
            } else {
                this.item_source = num;
                return;
            }
        }
        this.item = builder.item;
        this.tiebaplus_info = builder.tiebaplus_info;
        this.item_source = builder.item_source;
    }
}
