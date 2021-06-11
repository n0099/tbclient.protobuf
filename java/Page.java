package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class Page extends Message {
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer cur_good_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer current_page;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer has_prev;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer lz_total_floor;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer new_total_page;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer offset;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer page_size;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer pnum;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer req_num;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer tnum;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer total_count;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer total_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer total_page;
    public static final Integer DEFAULT_PAGE_SIZE = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Integer DEFAULT_CURRENT_PAGE = 0;
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    public static final Integer DEFAULT_TOTAL_PAGE = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_HAS_PREV = 0;
    public static final Integer DEFAULT_CUR_GOOD_ID = 0;
    public static final Integer DEFAULT_REQ_NUM = 0;
    public static final Integer DEFAULT_PNUM = 0;
    public static final Integer DEFAULT_TNUM = 0;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_LZ_TOTAL_FLOOR = 0;
    public static final Integer DEFAULT_NEW_TOTAL_PAGE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Page> {
        public Integer cur_good_id;
        public Integer current_page;
        public Integer has_more;
        public Integer has_prev;
        public Integer lz_total_floor;
        public Integer new_total_page;
        public Integer offset;
        public Integer page_size;
        public Integer pnum;
        public Integer req_num;
        public Integer tnum;
        public Integer total_count;
        public Integer total_num;
        public Integer total_page;

        public Builder() {
        }

        public Builder(Page page) {
            super(page);
            if (page == null) {
                return;
            }
            this.page_size = page.page_size;
            this.offset = page.offset;
            this.current_page = page.current_page;
            this.total_count = page.total_count;
            this.total_page = page.total_page;
            this.has_more = page.has_more;
            this.has_prev = page.has_prev;
            this.cur_good_id = page.cur_good_id;
            this.req_num = page.req_num;
            this.pnum = page.pnum;
            this.tnum = page.tnum;
            this.total_num = page.total_num;
            this.lz_total_floor = page.lz_total_floor;
            this.new_total_page = page.new_total_page;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Page build(boolean z) {
            return new Page(this, z);
        }
    }

    public Page(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.page_size;
            if (num == null) {
                this.page_size = DEFAULT_PAGE_SIZE;
            } else {
                this.page_size = num;
            }
            Integer num2 = builder.offset;
            if (num2 == null) {
                this.offset = DEFAULT_OFFSET;
            } else {
                this.offset = num2;
            }
            Integer num3 = builder.current_page;
            if (num3 == null) {
                this.current_page = DEFAULT_CURRENT_PAGE;
            } else {
                this.current_page = num3;
            }
            Integer num4 = builder.total_count;
            if (num4 == null) {
                this.total_count = DEFAULT_TOTAL_COUNT;
            } else {
                this.total_count = num4;
            }
            Integer num5 = builder.total_page;
            if (num5 == null) {
                this.total_page = DEFAULT_TOTAL_PAGE;
            } else {
                this.total_page = num5;
            }
            Integer num6 = builder.has_more;
            if (num6 == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num6;
            }
            Integer num7 = builder.has_prev;
            if (num7 == null) {
                this.has_prev = DEFAULT_HAS_PREV;
            } else {
                this.has_prev = num7;
            }
            Integer num8 = builder.cur_good_id;
            if (num8 == null) {
                this.cur_good_id = DEFAULT_CUR_GOOD_ID;
            } else {
                this.cur_good_id = num8;
            }
            Integer num9 = builder.req_num;
            if (num9 == null) {
                this.req_num = DEFAULT_REQ_NUM;
            } else {
                this.req_num = num9;
            }
            Integer num10 = builder.pnum;
            if (num10 == null) {
                this.pnum = DEFAULT_PNUM;
            } else {
                this.pnum = num10;
            }
            Integer num11 = builder.tnum;
            if (num11 == null) {
                this.tnum = DEFAULT_TNUM;
            } else {
                this.tnum = num11;
            }
            Integer num12 = builder.total_num;
            if (num12 == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = num12;
            }
            Integer num13 = builder.lz_total_floor;
            if (num13 == null) {
                this.lz_total_floor = DEFAULT_LZ_TOTAL_FLOOR;
            } else {
                this.lz_total_floor = num13;
            }
            Integer num14 = builder.new_total_page;
            if (num14 == null) {
                this.new_total_page = DEFAULT_NEW_TOTAL_PAGE;
                return;
            } else {
                this.new_total_page = num14;
                return;
            }
        }
        this.page_size = builder.page_size;
        this.offset = builder.offset;
        this.current_page = builder.current_page;
        this.total_count = builder.total_count;
        this.total_page = builder.total_page;
        this.has_more = builder.has_more;
        this.has_prev = builder.has_prev;
        this.cur_good_id = builder.cur_good_id;
        this.req_num = builder.req_num;
        this.pnum = builder.pnum;
        this.tnum = builder.tnum;
        this.total_num = builder.total_num;
        this.lz_total_floor = builder.lz_total_floor;
        this.new_total_page = builder.new_total_page;
    }
}
