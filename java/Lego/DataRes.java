package tbclient.Lego;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<String> DEFAULT_CARDS = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final String DEFAULT_PAGE_INFO = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> cards;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String page_info;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<String> cards;
        public Integer has_more;
        public String page_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.page_info = dataRes.page_info;
            this.cards = Message.copyOf(dataRes.cards);
            this.has_more = dataRes.has_more;
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
            String str = builder.page_info;
            if (str == null) {
                this.page_info = "";
            } else {
                this.page_info = str;
            }
            List<String> list = builder.cards;
            if (list == null) {
                this.cards = DEFAULT_CARDS;
            } else {
                this.cards = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.page_info = builder.page_info;
        this.cards = Message.immutableCopyOf(builder.cards);
        this.has_more = builder.has_more;
    }
}
