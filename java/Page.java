package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Page extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CURRENT_PAGE;
    public static final Integer DEFAULT_CUR_GOOD_ID;
    public static final Integer DEFAULT_HAS_MORE;
    public static final Integer DEFAULT_HAS_PREV;
    public static final Integer DEFAULT_LZ_TOTAL_FLOOR;
    public static final Integer DEFAULT_NEW_TOTAL_PAGE;
    public static final Integer DEFAULT_OFFSET;
    public static final Integer DEFAULT_PAGE_SIZE;
    public static final Integer DEFAULT_PNUM;
    public static final Integer DEFAULT_REQ_NUM;
    public static final Integer DEFAULT_TNUM;
    public static final Integer DEFAULT_TOTAL_COUNT;
    public static final Integer DEFAULT_TOTAL_NUM;
    public static final Integer DEFAULT_TOTAL_PAGE;
    public transient /* synthetic */ FieldHolder $fh;
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Page> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
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
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Page page) {
            super(page);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {page};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
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
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Page(this, z, null) : (Page) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1091184414, "Ltbclient/Page;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1091184414, "Ltbclient/Page;");
                return;
            }
        }
        DEFAULT_PAGE_SIZE = 0;
        DEFAULT_OFFSET = 0;
        DEFAULT_CURRENT_PAGE = 0;
        DEFAULT_TOTAL_COUNT = 0;
        DEFAULT_TOTAL_PAGE = 0;
        DEFAULT_HAS_MORE = 0;
        DEFAULT_HAS_PREV = 0;
        DEFAULT_CUR_GOOD_ID = 0;
        DEFAULT_REQ_NUM = 0;
        DEFAULT_PNUM = 0;
        DEFAULT_TNUM = 0;
        DEFAULT_TOTAL_NUM = 0;
        DEFAULT_LZ_TOTAL_FLOOR = 0;
        DEFAULT_NEW_TOTAL_PAGE = 0;
    }

    public /* synthetic */ Page(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Page(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
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
