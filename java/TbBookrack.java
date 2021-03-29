package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
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

    /* loaded from: classes7.dex */
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
            if (tbBookrack == null) {
                return;
            }
            this.booktown = tbBookrack.booktown;
            this.num = tbBookrack.num;
            this.book_list = Message.copyOf(tbBookrack.book_list);
            this.title = tbBookrack.title;
            this.icon = tbBookrack.icon;
            this.tip = tbBookrack.tip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbBookrack build(boolean z) {
            return new TbBookrack(this, z);
        }
    }

    public TbBookrack(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.booktown;
            if (str == null) {
                this.booktown = "";
            } else {
                this.booktown = str;
            }
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num;
            }
            List<BookInfo> list = builder.book_list;
            if (list == null) {
                this.book_list = DEFAULT_BOOK_LIST;
            } else {
                this.book_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            String str4 = builder.tip;
            if (str4 == null) {
                this.tip = "";
                return;
            } else {
                this.tip = str4;
                return;
            }
        }
        this.booktown = builder.booktown;
        this.num = builder.num;
        this.book_list = Message.immutableCopyOf(builder.book_list);
        this.title = builder.title;
        this.icon = builder.icon;
        this.tip = builder.tip;
    }
}
