package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class GiftInfo extends Message {
    public static final List<GiftList> DEFAULT_LIST = Collections.emptyList();
    public static final List<NumInfo> DEFAULT_NUM_INFO = Collections.emptyList();
    public static final Integer DEFAULT_VERSION = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GiftList> list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<NumInfo> num_info;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer version;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GiftInfo> {
        public List<GiftList> list;
        public List<NumInfo> num_info;
        public Integer version;

        public Builder() {
        }

        public Builder(GiftInfo giftInfo) {
            super(giftInfo);
            if (giftInfo == null) {
                return;
            }
            this.list = Message.copyOf(giftInfo.list);
            this.num_info = Message.copyOf(giftInfo.num_info);
            this.version = giftInfo.version;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftInfo build(boolean z) {
            return new GiftInfo(this, z);
        }
    }

    public GiftInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<GiftList> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            List<NumInfo> list2 = builder.num_info;
            if (list2 == null) {
                this.num_info = DEFAULT_NUM_INFO;
            } else {
                this.num_info = Message.immutableCopyOf(list2);
            }
            Integer num = builder.version;
            if (num == null) {
                this.version = DEFAULT_VERSION;
                return;
            } else {
                this.version = num;
                return;
            }
        }
        this.list = Message.immutableCopyOf(builder.list);
        this.num_info = Message.immutableCopyOf(builder.num_info);
        this.version = builder.version;
    }
}
