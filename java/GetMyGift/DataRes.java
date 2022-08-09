package tbclient.GetMyGift;

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
import tbclient.FansRankUserInfo;
import tbclient.PresentMyList;
import tbclient.PresetMyGiftPage;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_BLUE_DIAMOND;
    public static final Integer DEFAULT_CURRENCY;
    public static final List<PresentMyList> DEFAULT_GIFT_LIST;
    public static final Integer DEFAULT_MONEY;
    public static final List<FansRankUserInfo> DEFAULT_RANK_LIST;
    public static final Integer DEFAULT_SCENE_ID;
    public static final Integer DEFAULT_TOTAL_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer blue_diamond;
    @ProtoField(tag = 8)
    public final presentMoneyTxt blue_diamond_txt;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer currency;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PresentMyList> gift_list;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 3)
    public final presentMoneyTxt money_txt;
    @ProtoField(tag = 5)
    public final PresetMyGiftPage page;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<FansRankUserInfo> rank_list;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scene_id;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer total_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer blue_diamond;
        public presentMoneyTxt blue_diamond_txt;
        public Integer currency;
        public List<PresentMyList> gift_list;
        public Integer money;
        public presentMoneyTxt money_txt;
        public PresetMyGiftPage page;
        public List<FansRankUserInfo> rank_list;
        public Integer scene_id;
        public Integer total_num;

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
            this.total_num = dataRes.total_num;
            this.money = dataRes.money;
            this.money_txt = dataRes.money_txt;
            this.gift_list = Message.copyOf(dataRes.gift_list);
            this.page = dataRes.page;
            this.scene_id = dataRes.scene_id;
            this.blue_diamond = dataRes.blue_diamond;
            this.blue_diamond_txt = dataRes.blue_diamond_txt;
            this.rank_list = Message.copyOf(dataRes.rank_list);
            this.currency = dataRes.currency;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1915778452, "Ltbclient/GetMyGift/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1915778452, "Ltbclient/GetMyGift/DataRes;");
                return;
            }
        }
        DEFAULT_TOTAL_NUM = 0;
        DEFAULT_MONEY = 0;
        DEFAULT_GIFT_LIST = Collections.emptyList();
        DEFAULT_SCENE_ID = 0;
        DEFAULT_BLUE_DIAMOND = 0;
        DEFAULT_RANK_LIST = Collections.emptyList();
        DEFAULT_CURRENCY = 0;
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
            Integer num = builder.total_num;
            if (num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = num;
            }
            Integer num2 = builder.money;
            if (num2 == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = num2;
            }
            this.money_txt = builder.money_txt;
            List<PresentMyList> list = builder.gift_list;
            if (list == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = Message.immutableCopyOf(list);
            }
            this.page = builder.page;
            Integer num3 = builder.scene_id;
            if (num3 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num3;
            }
            Integer num4 = builder.blue_diamond;
            if (num4 == null) {
                this.blue_diamond = DEFAULT_BLUE_DIAMOND;
            } else {
                this.blue_diamond = num4;
            }
            this.blue_diamond_txt = builder.blue_diamond_txt;
            List<FansRankUserInfo> list2 = builder.rank_list;
            if (list2 == null) {
                this.rank_list = DEFAULT_RANK_LIST;
            } else {
                this.rank_list = Message.immutableCopyOf(list2);
            }
            Integer num5 = builder.currency;
            if (num5 == null) {
                this.currency = DEFAULT_CURRENCY;
                return;
            } else {
                this.currency = num5;
                return;
            }
        }
        this.total_num = builder.total_num;
        this.money = builder.money;
        this.money_txt = builder.money_txt;
        this.gift_list = Message.immutableCopyOf(builder.gift_list);
        this.page = builder.page;
        this.scene_id = builder.scene_id;
        this.blue_diamond = builder.blue_diamond;
        this.blue_diamond_txt = builder.blue_diamond_txt;
        this.rank_list = Message.immutableCopyOf(builder.rank_list);
        this.currency = builder.currency;
    }
}
