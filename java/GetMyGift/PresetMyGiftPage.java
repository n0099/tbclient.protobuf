package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class PresetMyGiftPage extends Message {
    public static final Integer DEFAULT_CUR_PAGE = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_TOTAL = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer cur_page;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer total;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PresetMyGiftPage> {
        public Integer cur_page;
        public Integer has_more;
        public Integer total;

        public Builder() {
        }

        public Builder(PresetMyGiftPage presetMyGiftPage) {
            super(presetMyGiftPage);
            if (presetMyGiftPage == null) {
                return;
            }
            this.cur_page = presetMyGiftPage.cur_page;
            this.has_more = presetMyGiftPage.has_more;
            this.total = presetMyGiftPage.total;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresetMyGiftPage build(boolean z) {
            return new PresetMyGiftPage(this, z);
        }
    }

    public PresetMyGiftPage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.cur_page;
            if (num == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
            } else {
                this.cur_page = num;
            }
            Integer num2 = builder.has_more;
            if (num2 == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num2;
            }
            Integer num3 = builder.total;
            if (num3 == null) {
                this.total = DEFAULT_TOTAL;
                return;
            } else {
                this.total = num3;
                return;
            }
        }
        this.cur_page = builder.cur_page;
        this.has_more = builder.has_more;
        this.total = builder.total;
    }
}
