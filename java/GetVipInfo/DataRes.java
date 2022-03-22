package tbclient.GetVipInfo;

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
import java.util.Collections;
import java.util.List;
import tbclient.AutoPayInfo;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<VipBasicList> DEFAULT_BASIC_LIST;
    public static final List<String> DEFAULT_CARD_ORDER;
    public static final String DEFAULT_GRADE_INTRO_LINK = "";
    public static final String DEFAULT_GRADE_INTRO_TITLE = "";
    public static final Integer DEFAULT_TODAY_GET_SCORE;
    public static final Integer DEFAULT_TODAY_UNGET_SCORE;
    public static final Integer DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 17)
    public final AutoPayInfo autopay_info;
    @ProtoField(tag = 7)
    public final VipBannerList banner_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<VipBasicList> basic_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
    public final List<String> card_order;
    @ProtoField(tag = 14)
    public final VipSpecialList cooperate_list;
    @ProtoField(tag = 16)
    public final VipDailyList daily_list;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String grade_intro_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String grade_intro_title;
    @ProtoField(tag = 9)
    public final VipRank rank;
    @ProtoField(tag = 5)
    public final VipSpecialList special_list;
    @ProtoField(tag = 8)
    public final VipTaskList task_list;
    @ProtoField(tag = 6)
    public final VipThemeList theme_list;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer today_get_score;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer today_unget_score;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 4)
    public final VipUpgrade upgrade;
    @ProtoField(tag = 1)
    public final VipUser user;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public AutoPayInfo autopay_info;
        public VipBannerList banner_list;
        public List<VipBasicList> basic_list;
        public List<String> card_order;
        public VipSpecialList cooperate_list;
        public VipDailyList daily_list;
        public String grade_intro_link;
        public String grade_intro_title;
        public VipRank rank;
        public VipSpecialList special_list;
        public VipTaskList task_list;
        public VipThemeList theme_list;
        public Integer today_get_score;
        public Integer today_unget_score;
        public Integer update_time;
        public VipUpgrade upgrade;
        public VipUser user;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.user = dataRes.user;
            this.grade_intro_title = dataRes.grade_intro_title;
            this.grade_intro_link = dataRes.grade_intro_link;
            this.upgrade = dataRes.upgrade;
            this.special_list = dataRes.special_list;
            this.theme_list = dataRes.theme_list;
            this.banner_list = dataRes.banner_list;
            this.task_list = dataRes.task_list;
            this.rank = dataRes.rank;
            this.today_get_score = dataRes.today_get_score;
            this.today_unget_score = dataRes.today_unget_score;
            this.card_order = Message.copyOf(dataRes.card_order);
            this.update_time = dataRes.update_time;
            this.cooperate_list = dataRes.cooperate_list;
            this.basic_list = Message.copyOf(dataRes.basic_list);
            this.daily_list = dataRes.daily_list;
            this.autopay_info = dataRes.autopay_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1243160565, "Ltbclient/GetVipInfo/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1243160565, "Ltbclient/GetVipInfo/DataRes;");
                return;
            }
        }
        DEFAULT_TODAY_GET_SCORE = 0;
        DEFAULT_TODAY_UNGET_SCORE = 0;
        DEFAULT_CARD_ORDER = Collections.emptyList();
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_BASIC_LIST = Collections.emptyList();
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            this.user = builder.user;
            String str = builder.grade_intro_title;
            if (str == null) {
                this.grade_intro_title = "";
            } else {
                this.grade_intro_title = str;
            }
            String str2 = builder.grade_intro_link;
            if (str2 == null) {
                this.grade_intro_link = "";
            } else {
                this.grade_intro_link = str2;
            }
            this.upgrade = builder.upgrade;
            this.special_list = builder.special_list;
            this.theme_list = builder.theme_list;
            this.banner_list = builder.banner_list;
            this.task_list = builder.task_list;
            this.rank = builder.rank;
            Integer num = builder.today_get_score;
            if (num == null) {
                this.today_get_score = DEFAULT_TODAY_GET_SCORE;
            } else {
                this.today_get_score = num;
            }
            Integer num2 = builder.today_unget_score;
            if (num2 == null) {
                this.today_unget_score = DEFAULT_TODAY_UNGET_SCORE;
            } else {
                this.today_unget_score = num2;
            }
            List<String> list = builder.card_order;
            if (list == null) {
                this.card_order = DEFAULT_CARD_ORDER;
            } else {
                this.card_order = Message.immutableCopyOf(list);
            }
            Integer num3 = builder.update_time;
            if (num3 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num3;
            }
            this.cooperate_list = builder.cooperate_list;
            List<VipBasicList> list2 = builder.basic_list;
            if (list2 == null) {
                this.basic_list = DEFAULT_BASIC_LIST;
            } else {
                this.basic_list = Message.immutableCopyOf(list2);
            }
            this.daily_list = builder.daily_list;
            this.autopay_info = builder.autopay_info;
            return;
        }
        this.user = builder.user;
        this.grade_intro_title = builder.grade_intro_title;
        this.grade_intro_link = builder.grade_intro_link;
        this.upgrade = builder.upgrade;
        this.special_list = builder.special_list;
        this.theme_list = builder.theme_list;
        this.banner_list = builder.banner_list;
        this.task_list = builder.task_list;
        this.rank = builder.rank;
        this.today_get_score = builder.today_get_score;
        this.today_unget_score = builder.today_unget_score;
        this.card_order = Message.immutableCopyOf(builder.card_order);
        this.update_time = builder.update_time;
        this.cooperate_list = builder.cooperate_list;
        this.basic_list = Message.immutableCopyOf(builder.basic_list);
        this.daily_list = builder.daily_list;
        this.autopay_info = builder.autopay_info;
    }
}
