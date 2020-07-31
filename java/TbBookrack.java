package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class TbBookrack extends Message {
    public static final String DEFAULT_BOOKTOWN = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TIP = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BookInfo> book_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String booktown;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tip;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_NUM = 0;
    public static final List<BookInfo> DEFAULT_BOOK_LIST = Collections.emptyList();

    private TbBookrack(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.booktown == null) {
                this.booktown = "";
            } else {
                this.booktown = builder.booktown;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = builder.num;
            }
            if (builder.book_list == null) {
                this.book_list = DEFAULT_BOOK_LIST;
            } else {
                this.book_list = immutableCopyOf(builder.book_list);
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.tip == null) {
                this.tip = "";
                return;
            } else {
                this.tip = builder.tip;
                return;
            }
        }
        this.booktown = builder.booktown;
        this.num = builder.num;
        this.book_list = immutableCopyOf(builder.book_list);
        this.title = builder.title;
        this.icon = builder.icon;
        this.tip = builder.tip;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<TbBookrack> {
        public List<BookInfo> book_list;
        public String booktown;
        public String icon;
        public Integer num;
        public String tip;
        public String title;

        public Builder() {
        }

        public Builder(TbBookrack tbBookrack) {
            super(tbBookrack);
            if (tbBookrack != null) {
                this.booktown = tbBookrack.booktown;
                this.num = tbBookrack.num;
                this.book_list = TbBookrack.copyOf(tbBookrack.book_list);
                this.title = tbBookrack.title;
                this.icon = tbBookrack.icon;
                this.tip = tbBookrack.tip;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbBookrack build(boolean z) {
            return new TbBookrack(this, z);
        }
    }
}
