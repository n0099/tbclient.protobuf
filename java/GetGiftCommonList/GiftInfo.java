package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
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

    private GiftInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = immutableCopyOf(builder.list);
            }
            if (builder.num_info == null) {
                this.num_info = DEFAULT_NUM_INFO;
            } else {
                this.num_info = immutableCopyOf(builder.num_info);
            }
            if (builder.version == null) {
                this.version = DEFAULT_VERSION;
                return;
            } else {
                this.version = builder.version;
                return;
            }
        }
        this.list = immutableCopyOf(builder.list);
        this.num_info = immutableCopyOf(builder.num_info);
        this.version = builder.version;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GiftInfo> {
        public List<GiftList> list;
        public List<NumInfo> num_info;
        public Integer version;

        public Builder() {
        }

        public Builder(GiftInfo giftInfo) {
            super(giftInfo);
            if (giftInfo != null) {
                this.list = GiftInfo.copyOf(giftInfo.list);
                this.num_info = GiftInfo.copyOf(giftInfo.num_info);
                this.version = giftInfo.version;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftInfo build(boolean z) {
            return new GiftInfo(this, z);
        }
    }
}
