package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class OrderList extends Message {
    public static final String DEFAULT_ACTIVITY_DESC = "";
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_BUTTON_NAME = "";
    public static final String DEFAULT_ORDER_ID = "";
    public static final String DEFAULT_PREG_FIELD = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String activity_desc;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String button_name;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long create_time;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long finish_time;
    @ProtoField(tag = 19, type = Message.Datatype.INT64)
    public final Long money;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String order_id;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String preg_field;
    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer scene_id;
    @ProtoField(tag = 20, type = Message.Datatype.INT64)
    public final Long scores;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_FINISH_TIME = 0L;
    public static final Integer DEFAULT_SCENE_ID = 0;
    public static final Long DEFAULT_MONEY = 0L;
    public static final Long DEFAULT_SCORES = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<OrderList> {
        public String activity_desc;
        public String activity_url;
        public String button_name;
        public Long create_time;
        public Long finish_time;
        public Long money;
        public String order_id;
        public String preg_field;
        public Integer scene_id;
        public Long scores;
        public Integer status;
        public String title;

        public Builder() {
        }

        public Builder(OrderList orderList) {
            super(orderList);
            if (orderList == null) {
                return;
            }
            this.order_id = orderList.order_id;
            this.status = orderList.status;
            this.create_time = orderList.create_time;
            this.finish_time = orderList.finish_time;
            this.title = orderList.title;
            this.activity_desc = orderList.activity_desc;
            this.activity_url = orderList.activity_url;
            this.button_name = orderList.button_name;
            this.scene_id = orderList.scene_id;
            this.money = orderList.money;
            this.scores = orderList.scores;
            this.preg_field = orderList.preg_field;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OrderList build(boolean z) {
            return new OrderList(this, z);
        }
    }

    public OrderList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.order_id;
            if (str == null) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Long l = builder.create_time;
            if (l == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l;
            }
            Long l2 = builder.finish_time;
            if (l2 == null) {
                this.finish_time = DEFAULT_FINISH_TIME;
            } else {
                this.finish_time = l2;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.activity_desc;
            if (str3 == null) {
                this.activity_desc = "";
            } else {
                this.activity_desc = str3;
            }
            String str4 = builder.activity_url;
            if (str4 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str4;
            }
            String str5 = builder.button_name;
            if (str5 == null) {
                this.button_name = "";
            } else {
                this.button_name = str5;
            }
            Integer num2 = builder.scene_id;
            if (num2 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num2;
            }
            Long l3 = builder.money;
            if (l3 == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = l3;
            }
            Long l4 = builder.scores;
            if (l4 == null) {
                this.scores = DEFAULT_SCORES;
            } else {
                this.scores = l4;
            }
            String str6 = builder.preg_field;
            if (str6 == null) {
                this.preg_field = "";
                return;
            } else {
                this.preg_field = str6;
                return;
            }
        }
        this.order_id = builder.order_id;
        this.status = builder.status;
        this.create_time = builder.create_time;
        this.finish_time = builder.finish_time;
        this.title = builder.title;
        this.activity_desc = builder.activity_desc;
        this.activity_url = builder.activity_url;
        this.button_name = builder.button_name;
        this.scene_id = builder.scene_id;
        this.money = builder.money;
        this.scores = builder.scores;
        this.preg_field = builder.preg_field;
    }
}
